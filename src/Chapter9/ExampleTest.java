package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        dao.addBoard("제목1","내용1");
        dao.addBoard("제목2","내용2");
        dao.addBoard("제목3","내용3");
        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
    }
}

}

class BoardDao {
    public static List<Board> boards = new ArrayList<>();
    public List<Board> getBoardList() {
        return boards;
    }
    public void addBoard(String title, String content) {
        new Board(title, content);
    }
}
class Board {
    private String title;
    private String content;
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
        BoardDao.boards.add(this);
    }
    public String getTitle() { return title; }
    public String getContent() { return content; }
}