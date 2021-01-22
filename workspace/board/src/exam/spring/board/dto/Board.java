package exam.spring.board.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int id;
	private String memberId;
	private String title;
	private String content;
	private int readCount;
	private Date writeDate;
	private Date updateDate;
	@Override
	public String toString() {
		return "Board [id=" + id + ", memberId=" + memberId + ", title=" + title + ", content=" + content
				+ ", readCount=" + readCount + ", writeDate=" + getWriteDate() + ", updateDate=" + updateDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getWriteDate() {
		SimpleDateFormat sf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		return sf.format(writeDate);
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
