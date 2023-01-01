package com.example.tugasloginregister.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    @NonNull
    public String nim;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "password")
    public String password;
    public String username;
}