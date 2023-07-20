//package kr.ezen.jpademo;
//
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class BbsRepositoryTest2 {
//    @Autowired
//    private BbsRepository bbsRepository;
//
//    @BeforeEach
//    public void dummyData() {
//        for(int i = 1; i<=100; i++){
//            Bbs bbs = new Bbs();
//            bbs.setBno((long) i);
//            bbs.setTitle("title" + i);
//            bbs.setContent("content" + i);
//            bbs.setWriter("writer" + (i % 10)); // writer1 ~ 10
//            bbs.setViewCnt((long) (Math.random()*100)); //0~99
//            bbs.setRegDate(new Date());
//            bbs.setUpDate(new Date());
//
//            bbsRepository.save(bbs);
//        }
//    }
//
//    @Test
//    public void countTest(){
//        assertTrue(bbsRepository.countAllByWriter("writer7") == 10);
//    }
//
//    @Test
//    public void findTest(){
//        List<Bbs> list = bbsRepository.findByWriter("writer3");
//        assertTrue(list.size() == 10);
////        list.forEach(System.out::println);
//        // 위의 람다식을 조금더 간편하게 사용하는 메서드 참조 문법
//        // System.out.println(p) ---> System.out::println
//        list.forEach((li) -> System.out.println("li = " + li));
//    }
//
//    @Test
//    public void TitleAndWriter(){
//        List<Bbs> list = bbsRepository.findByTitleAndWriter("title2", "writer2");
//
//        assertTrue(list.size()==1);
//    }
//
//    @Test
//    public void deleteTest(){
//        // 삭제행의 개수를 리턴
//        assertTrue(bbsRepository.deleteByWriter("writer4") ==10);
//        List<Bbs> list=bbsRepository.findBbsByWriter("writer4");
//        assertTrue(list.size() == 0);
//    }
//
//}