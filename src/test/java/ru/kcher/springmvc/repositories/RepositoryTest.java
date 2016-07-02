package ru.kcher.springmvc.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.kcher.springmvc.configuration.RepositoryConfiguration;
import ru.kcher.springmvc.model.User;
import ru.kcher.springmvc.repository.UserRepository;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class RepositoryTest {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void testSaveUser(){
        //setup user
        User user = new User();
        user.setLogin("Spring");
        user.setPassword("1234");

        //save user, verify has ID value after save
        assertNull(user.getId()); //null before save
        userRepository.save(user);
        assertNotNull(user.getId()); //not null after save

        //fetch from DB
        User fetchedUser = userRepository.findOne(user.getId());

        //should not be null
        assertNotNull(fetchedUser);

        //should equal
        assertEquals(user.getId(), fetchedUser.getId());
        assertEquals(user.getLogin().trim(), fetchedUser.getLogin().trim());

        //update description and save
        fetchedUser.setLogin("New Desc");
        userRepository.save(fetchedUser);

        //get from DB, should be updated
        User fetchedUpdatedUser = userRepository.findOne(fetchedUser.getId());
        assertEquals(fetchedUser.getLogin().trim(), fetchedUpdatedUser.getLogin().trim());
    }
}
