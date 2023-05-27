package com.appengine.service;



import com.appengine.model.Comment;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;


public class OfyService {
    static {
        ObjectifyService.register(Comment.class);
    }
    public static Objectify ofy(){
        return ObjectifyService.ofy();
    }
}

