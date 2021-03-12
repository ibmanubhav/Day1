class Datawarehouse extends Customer {
	public Datawarehouse() {
		 super();
		// TODO Auto-generated constructor stub
	}

	private String ordername;

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	private STATUS status = STATUS.DELIVERED;

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

}