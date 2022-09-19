package one.magnus.backend.test;

import one.magnus.backend.models.Post;
import one.magnus.backend.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestData implements CommandLineRunner {

    private final PostRepository postRepository;

    @Autowired
    public TestData(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Post post1 = new Post();
        post1.setBody("bodypost1");
        post1.setTitle("titlepost1");
        postRepository.save(post1);
    }
}