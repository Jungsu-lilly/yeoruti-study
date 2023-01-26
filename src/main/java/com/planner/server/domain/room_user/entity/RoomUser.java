package com.planner.server.domain.room_user.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.planner.server.domain.study_room.entity.StudyRoom;
import com.planner.server.domain.user.entity.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room_user")
@Getter
public class RoomUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;
    
    @Type(type = "uuid-char")
    private UUID id;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_room_id")
    private StudyRoom studyRoom;
}