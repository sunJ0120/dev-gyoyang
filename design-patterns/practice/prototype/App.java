package prototype;

public class App {

    public static void main(String[] args) throws Exception {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        // 이 기존의 인스턴스를 프로토타입으로 사용하여 복제한다.
        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        /*
         clone != githubIssue (다른 인스턴스가 새로 만들어진 것이기 때문이다)
         clone.equals(githubIssue) : 안의 내용은 같기 때문에 true를 써야 한다.
         */
        GithubIssue clone = githubIssue.clone();
        System.out.println(clone.getUrl());
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() ==  githubIssue.getClass());
        System.out.println(clone.getRepository() ==  githubIssue.getRepository());
    }
}
