import java.util.Date;
import java.util.List;

public class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Adress adress;


    public User(Date birthdate, int size, List<Photo> photos, Adress adress) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.adress = adress;
    }


    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}