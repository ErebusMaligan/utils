package gui.page.panel;

import javax.swing.JPanel;

import gui.page.PagedDataViewer;
import icon.DefaultIconLoader;

/**
 * @author Daniel J. Rivers
 *         2015
 *
 * Created: Jun 1, 2015, 4:39:22 PM 
 */
public abstract class PageControlPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public abstract void construct( PagedDataViewer<?> dataViewer );
	
	public abstract void setPageInfo( int cur, int pages, int per, int minPer, int maxPer );

	public abstract void construct( PagedDataViewer<?> dataViewer, DefaultIconLoader icon );
}