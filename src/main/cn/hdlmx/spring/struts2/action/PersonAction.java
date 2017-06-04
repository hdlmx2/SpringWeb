package cn.hdlmx.spring.struts2.action;

import cn.hdlmx.spring.struts2.service.PersonService;

public class PersonAction {
    public PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public String execute() {
        System.out.println("execute...");
        personService.save();
        return "success";
    }
}
