package com.github.walterfan.devaider.domain;

import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

@Data
public class Task extends BaseObject {
    public static final int TASKTYPE_UNDEFINED = 0;

    public static final int TASKTYPE_NEXTACTION = 1;

    public static final int TASKTYPE_ONSCHEDULE = 2;

    public static final int TASKTYPE_WAITOTHERS = 3;

    private Long taskId;

    private String taskName;

    private int priority;

    private Date deadline;

    private int userId;

    protected int repeatId = 0;

    private int duration;

    private String description;

    private Date beginTime;

    private Date endTime;

    private int remindId;

    private Date createTime = new Date(System.currentTimeMillis());

    private int categoryId;

    private int contextId;

    private int taskType;

    private int energy;


}
