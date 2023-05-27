package com.crud.service;


import com.crud.model.Comment;
import com.crud.model.Employee;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;


public class OfyService {
    /**
     *
     * Create OfyService and register it only once.
     * Used static block to achieve this functionality
     *
     */

    static{

        ObjectifyService.register(Comment.class);
        ObjectifyService.register(Employee.class);

    }

    public static Objectify ofy(){
        return ObjectifyService.ofy();
    }
}
