package com.github.walterfan.devaider.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Book extends BaseObject {

    private Long bookId;

    private String isbn;

    private String name;

    private String author;

    private String tags;

    private Date borrowTime;

    private Date returnTime;


}
