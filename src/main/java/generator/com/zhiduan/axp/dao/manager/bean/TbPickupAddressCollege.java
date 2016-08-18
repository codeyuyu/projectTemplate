package generator.com.zhiduan.axp.dao.manager.bean;

public class TbPickupAddressCollege {
    private Long pacId;

    private Long pickupAddressId;

    private Long collegeId;

    public TbPickupAddressCollege(Long pacId, Long pickupAddressId, Long collegeId) {
        this.pacId = pacId;
        this.pickupAddressId = pickupAddressId;
        this.collegeId = collegeId;
    }

    public TbPickupAddressCollege() {
        super();
    }

    public Long getPacId() {
        return pacId;
    }

    public void setPacId(Long pacId) {
        this.pacId = pacId;
    }

    public Long getPickupAddressId() {
        return pickupAddressId;
    }

    public void setPickupAddressId(Long pickupAddressId) {
        this.pickupAddressId = pickupAddressId;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }
}