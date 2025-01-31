package in.infinity.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "passport_tbl")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ppid;
	private String pnumber;
	private LocalDate createdDate;
	private LocalDate expiredate;

	@OneToOne
	@JoinColumn
	private Person person;

	public Integer getPpid() {
		return ppid;
	}

	public void setPpid(Integer ppid) {
		this.ppid = ppid;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(LocalDate expiredate) {
		this.expiredate = expiredate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [ppid=" + ppid + ", pnumber=" + pnumber + ", createdDate=" + createdDate + ", expiredate="
				+ expiredate + ", person=" + person + "]";
	}

}
