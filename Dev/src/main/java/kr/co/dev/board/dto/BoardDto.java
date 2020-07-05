package kr.co.dev.board.dto;

public class BoardDto {
	
	private int bid;
	private String title;
	private String content;
	private String writer;
	private int view;
	private String reg_date;
	private String fix_date;
	
	
	/**
	 * @return bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid セットする bid
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content セットする content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer セットする writer
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return view
	 */
	public int getView() {
		return view;
	}
	/**
	 * @param view セットする view
	 */
	public void setView(int view) {
		this.view = view;
	}
	/**
	 * @return reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}
	/**
	 * @param reg_date セットする reg_date
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	/**
	 * @return fix_date
	 */
	public String getFix_date() {
		return fix_date;
	}
	/**
	 * @param fix_date セットする fix_date
	 */
	public void setFix_date(String fix_date) {
		this.fix_date = fix_date;
	}
	
	

}
