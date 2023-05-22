import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FriendListImple implements FriendList {

	List<Friend> list = new ArrayList<>();
	private static final String FILENAME = "FriendList.dat";

	@Override
	public boolean insert(Friend fr) {
		return list.add(fr);
	}

	@Override
	public Friend selectOne(String name) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getName().equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean delete(String phone) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPhone().equals(phone)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Friend> selectALL() {
		return list;
	}

	@Override
	public void saveFile() {
		try {
			FileOutputStream fos = new FileOutputStream("FriendList.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			if(fos !=null) fos.close();
			if(oos !=null) oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void loadFile() {
		try {
			File file = new File(FILENAME);
			if(!file.exists()) return;
			FileInputStream fis = new FileInputStream(FILENAME);
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<Friend> temp = (List<Friend>)ois.readObject();

			if(fis !=null) fis.close();
			if(ois !=null) ois.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
