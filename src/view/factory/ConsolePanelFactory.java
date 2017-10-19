package view.factory;

import controller.ControllerInterface;
import view.ViewInterface;

public class ConsolePanelFactory {

	public Panel choosePanel(ConsoleType preview, ControllerInterface controller, ViewInterface view){
		switch(preview){
		case TOKENS:
			return new view.consolepanels.MessagePanel(ConsoleType.TOKENS, controller);
		case ERRORS:
			return new view.consolepanels.ErrorPanel(ConsoleType.ERRORS, controller);
		
		default:
			return null;
		
		/*
			case :
				return new view.sharedpanels.AgendaPanel(1, controller); //1 day lang
			case AGENDA_WEEK:
				return new view.sharedpanels.AgendaPanel(7, controller); //7 days lang
			case CALENDAR_DAY:
				return new view.sharedpanels.CalendarPanel(1, controller);
			case CALENDAR_WEEK:
				return new view.sharedpanels.CalendarPanel(7, controller);
			case RESERVE:
				return new view.sharedpanels.ReservePanel(controller);
			case ADDRECURRING:
				return new view.doctor.MultiAppState(controller);
			case ADDSINGLE:
				return new view.doctor.SingleAppState(controller, view);
			case REMOVESINGLE:
				return new view.doctor.RemoveAppState(controller, view);
			case EDITSINGLE:
				return new view.doctor.EditSinglePanel(controller, view);
			default:
				return null;
		*/
		}
		//return state;
	}
	
}
