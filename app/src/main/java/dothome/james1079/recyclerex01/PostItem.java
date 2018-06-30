package dothome.james1079.recyclerex01;

public class PostItem {
    private String ImgUrl;
    private String tit;
    private Boolean likeChk;
    private Boolean shareChk;



    public PostItem(String imgUrl, String tit, Boolean likeChk, Boolean shareChk) { //기본값 세팅
        ImgUrl = imgUrl;  // 요청시 주기만함
        this.tit = tit;  // 요청시 주기만함
        this.likeChk = likeChk;  //요청하면 변함
        this.shareChk = shareChk;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public String getTit() {
        return tit;
    }

    public Boolean getLikeChk() {
        return likeChk;
    }

    public void setLikeChk(Boolean likeChk) {
        this.likeChk = likeChk;
    }

    public Boolean getShareChk() {
        return shareChk;
    }

    public void setShareChk(Boolean shareChk) {
        this.shareChk = shareChk;
    }

}
