package lesson6.bstapi;

class Program implements Comparable<Program>{
	int pid;
	String cname;
	public Program(int pid, String cname) {
		super();
		this.pid = pid;
		this.cname = cname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return  pid + "  " + cname;
	}
	@Override
	public int compareTo(Program o) {
		return Integer.compare(this.pid, o.pid);
	}
}