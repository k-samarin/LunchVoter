package ru.ks.lunchvoter.web.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ks.lunchvoter.model.User;
import ru.ks.lunchvoter.repository.UserRepository;

@Slf4j
public abstract class AbstractUserController {
    @Autowired
    protected UserRepository repository;

    /*
    @Autowired
    private UniqueMailValidator emailValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(emailValidator);
    }
    */

    public User get(int id) {
        log.info("get {}", id);
        return repository.getExisted(id);
    }

    public void delete(int id) {
        log.info("delete {}", id);
        repository.deleteExisted(id);
    }

}
