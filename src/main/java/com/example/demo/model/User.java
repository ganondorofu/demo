package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自動インクリメント
    @Column(name = "user_id")
    private Long userId;

    @NotNull
    @Size(min = 1, max = 255)  // 必須フィールドで最大長を設定
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Email  // メールアドレスの形式を検証
    @Size(min = 1, max = 255)  // 必須フィールドで最大長を設定
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    // ゲッターとセッター
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
