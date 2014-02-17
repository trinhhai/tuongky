package com.tuongky.model.datastore;

import javax.persistence.Id;

/**
 * Created by sngo on 2/12/14.
 */
public class SimpleCounter {
  private long counter = 0;
  private @Id String id;

  @SuppressWarnings("unused")
  private SimpleCounter(){
    // Used by Objectify.
  }
  public SimpleCounter(String id){
    this.id = id;
  }

  public void increase() {
    counter++;
  }

  public long getCounter() {
    return counter;
  }

  public void setCounter(long counter) {
    this.counter = counter;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}