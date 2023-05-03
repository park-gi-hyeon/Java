package board;

import java.sql.Timestamp;

public class BoardBean {
	private int B_id;
	private String B_name;
	private String B_email;
	private String B_title;
	private String B_content;
	private Timestamp B_date;
	private int B_hit;
	private String B_pwd;
	private String B_ip;
	
	public String getB_ip() {
		return B_ip;
	}
	public void setB_ip(String b_ip) {
		B_ip = b_ip;
	}
	public String getB_pwd() {
		return B_pwd;
	}
	public void setB_pwd(String b_pwd) {
		B_pwd = b_pwd;
	}
	public int getB_hit() {
		return B_hit;
	}
	public void setB_hit(int B_hit) {
		this.B_hit = B_hit;
	}
	public Timestamp getB_date() {
		return B_date;
	}
	public void setB_date(Timestamp b_date) {
		B_date = b_date;
	}
	public String getB_name() {
		return B_name;
	}
	public void setB_name(String b_name) {
		B_name = b_name;
	}
	public String getB_email() {
		return B_email;
	}
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public void setB_email(String b_email) {
		B_email = b_email;
	}
	public String getB_title() {
		return B_title;
	}
	public void setB_title(String b_title) {
		B_title = b_title;
	}
	public String getB_content() {
		return B_content;
	}
	public void setB_content(String b_content) {
		B_content = b_content;
	}
}
