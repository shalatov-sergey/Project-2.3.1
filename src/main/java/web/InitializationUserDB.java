package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;
import web.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class InitializationUserDB {
        private UserService userService;

        @Autowired
        public InitializationUserDB(UserService userService) {
            this.userService = userService;
        }

        @PostConstruct
        public void testMethod() {
            userService.addUser(new User("Diana", "Andreeva", "Malaya Posadskaya Street, 30"));
            userService.addUser(new User("Elizaveta", "Amandosova", "Kollontai Street, 10"));
            userService.addUser(new User("Elina", "Akulova", "Kosigina Avenue, 14"));
        }
}
