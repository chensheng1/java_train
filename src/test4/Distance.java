package test4;

public class Distance {
    // ��֪��id
    private long id;
    // δ֪��id
    private long nid;
    // ����֮��ľ���
    private double disatance;
 
     
     
    public Distance(long id, long nid, double disatance) {
        this.id = id;
        this.nid = nid;
        this.disatance = disatance;
    }



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getNid() {
		return nid;
	}



	public void setNid(long nid) {
		this.nid = nid;
	}



	public double getDisatance() {
		return disatance;
	}



	public void setDisatance(double disatance) {
		this.disatance = disatance;
	}
        
       //get��set����ʡ��
 
}
