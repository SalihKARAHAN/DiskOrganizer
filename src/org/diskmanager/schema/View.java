/**
 * 
 */
package org.diskmanager.schema;

/**
 * @author Salih.KARAHAN
 *
 */
public class View {
	private String _path;
	private boolean _resizable;
	private String _title;
	private String[] _styleSheetPaths;

	/**
	 * @param _path
	 * @param _resizable
	 * @param _title
	 * @param _styleSheetPaths
	 */
	public View(String path, boolean resizable, String title, String... styleSheetPaths) {
		this._path = path;
		this._resizable = resizable;
		this._title = title;
		this._styleSheetPaths = styleSheetPaths;
	}

	public String GetPath() {
		return _path;
	}

	public boolean IsResizable() {
		return _resizable;
	}

	public String GetTitle() {
		return _title;
	}

	public String[] GetStyleSheetPathList() {
		return _styleSheetPaths;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
