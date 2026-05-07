package com.example.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final DeveloperService developerService;

    public DataSeeder(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @Override
    public void run(String... args) {
        if (developerService.developerExists(1L)) return; // don't re-seed on restart

        Developer dev = new Developer();
        dev.setName("Ryan Pelto");
        dev.setEmail("ryanpelto13@gmail.com");
        dev.setLinkedIn("https://www.linkedin.com/in/ryan-pelto-48a6341a1/");
        dev.setGitHub("https://github.com/RyPel13");
        dev.setIntroduction("I am an information technology student passionate about " +
                            "software development and data structures.");
        developerService.saveDeveloper(dev);

        Project p1 = new Project("Image Classification Program",
                "This system creates the blueprints for image classification.",
                "https://github.com/yourname/ImageClassification", "Java",
                "Object-Oriented Programming");
        p1.setDeveloper(dev);
        developerService.saveProject(p1);

        Goal g1 = new Goal("Full Stack Developer",
                "Become a proficient full stack developer using Java and React",
                "Long Term", false);
        g1.setDeveloper(dev);
        developerService.saveGoal(g1);

        Interest i1 = new Interest("Software Development",
                "Passionate about building clean and efficient software solutions",
                "Technology");
        developerService.saveInterest(i1);
    }
}