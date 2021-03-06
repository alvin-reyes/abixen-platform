/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.form;

import com.abixen.platform.core.model.enumtype.UserGender;
import com.abixen.platform.core.model.impl.User;
import com.abixen.platform.core.util.WebModelJsonSerialize;
import com.abixen.platform.core.model.UserBase;
import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class UserForm implements Form {

    @JsonView(WebModelJsonSerialize.class)
    private Long id;

    @JsonView(WebModelJsonSerialize.class)
    @NotNull
    @Email
    @Length(min = UserBase.USERNAME_MIN_LENGTH, max = UserBase.USERNAME_MAX_LENGTH)
    private String username;

    @JsonView(WebModelJsonSerialize.class)
    @NotNull
    @Length(min = UserBase.SCREEN_NAME_MIN_LENGTH, max = UserBase.SCREEN_NAME_MAX_LENGTH)
    private String screenName;

    @JsonView(WebModelJsonSerialize.class)
    @NotNull
    @Length(min = UserBase.FIRST_NAME_MIN_LENGTH, max = UserBase.FIRST_NAME_MAX_LENGTH)
    private String firstName;

    @JsonView(WebModelJsonSerialize.class)
    @Length(min = UserBase.MIDDLE_NAME_MIN_LENGTH, max = UserBase.MIDDLE_NAME_MAX_LENGTH)
    private String middleName;

    @JsonView(WebModelJsonSerialize.class)
    @NotNull
    @Length(min = UserBase.LAST_NAME_MIN_LENGTH, max = UserBase.LAST_NAME_MAX_LENGTH)
    private String lastName;

    @JsonView(WebModelJsonSerialize.class)
    private String jobTitle;

    @JsonView(WebModelJsonSerialize.class)
    private Date birthday;

    @JsonView(WebModelJsonSerialize.class)
    private UserGender gender;

    public UserForm() {

    }

    public UserForm(User user) {
        this.username = user.getUsername();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }
}
