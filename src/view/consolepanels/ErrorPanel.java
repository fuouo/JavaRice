package view.consolepanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controller.ControllerInterface;
import controller.IDEController;
import model.javarice.error.Error;
import view.factory.ConsoleType;
import view.factory.Panel;

public class ErrorPanel extends Panel {

	private JTable errorTable;
	
	public ErrorPanel(ConsoleType id, ControllerInterface controller){
		
		this.setId(id);
		
		setLayout(new BorderLayout());
		setBackground(Color.black);
		
		errorTable = new JTable(){
			public boolean isCellEditable(int row, int column) {                
                return false;               
			};
		};
		
		errorTable.setRowHeight(20);
		errorTable.setShowGrid(false);
		errorTable.setShowVerticalLines(false);
		errorTable.setShowHorizontalLines(false);
		errorTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Type", "Line", "Message", 
				}
			));
		
		errorTable.getColumnModel().getColumn(0).setPreferredWidth(130);
		errorTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		errorTable.getColumnModel().getColumn(2).setPreferredWidth(1020);
		JScrollPane scrollPane = new JScrollPane(errorTable);
		
		errorTable.setCellSelectionEnabled(false);
		errorTable.setColumnSelectionAllowed(false);
		errorTable.setRowSelectionAllowed(true);
			
		
		errorTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if(errorTable.getSelectedRow() <= -1){
					return;
				}
				int line = Integer.parseInt(errorTable.getValueAt(errorTable.getSelectedRow(), 1).toString());
				if(line < 0)
					return;
				System.out.println("LINE: " + line);
				IDEController cntrl = (IDEController) controller;
				cntrl.clearLineHighlights();
				cntrl.goToLine(line);
			}
			
		});
		
		add(scrollPane, BorderLayout.CENTER);
		
	}
	
	public void addRow(Error error) {
		DefaultTableModel model = (DefaultTableModel) errorTable.getModel();
		model.addRow(new Object[]{
				error.getErrorType(), error.getLine(), error.getMessage()
				});
	}
	
	public void addRow(String type, int line, String message){
		DefaultTableModel model = (DefaultTableModel) errorTable.getModel();
		model.addRow(new Object[]{
				type, line, message
				});
	}

	@Override
	public void update(ControllerInterface controller) {
		
	}

	public void removeAllRow(){
		DefaultTableModel model = (DefaultTableModel) errorTable.getModel();
		model.setRowCount(0);
		errorTable.revalidate();
	}
	
	@Override
	public void displayItems(ArrayList<Object> list) {
//		if(list==null)
//			return;
//		removeAllRow();
//		errorTable.revalidate();
//		
//		for(int i=0; i<list.size(); i++){
//			Error error = ((Error)list.get(i));
//			addRow(
//				error.getErrorType().toString(),
//				error.getLine(),
//				error.getMessage()
//					);
//		}
//		
//		
	}
	
}
