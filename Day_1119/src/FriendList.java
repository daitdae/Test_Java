import java.util.List;

public interface FriendList {
	
	public boolean insert(Friend fr);
	public Friend selectOne(String name);
	public boolean delete(String phone);
	public List<Friend> selectALL();
	
	public void saveFile();
	public void loadFile();

}
