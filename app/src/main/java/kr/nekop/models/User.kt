package kr.nekop.models

class User {
    private var username: String;
    private var password: String;
    private var level: Integer;
    private var uuid: String;

    constructor(
            username: String,
            password: String,
            level: Integer,
            uuid: String
    ) {
        this.username = username;
        this.password = password;
        this.level = level;
        this.uuid = uuid;
    }

    fun getUsername(): String { return username; }
    fun getPassword(): String { return password; }
    fun getLevel(): Integer { return level; }
    fun getUUID(): String { return uuid; }

    fun setUsername(username: String) { this.username = username; }
    fun setPassword(password: String) { this.password = password; }
    fun setLevel(level: Integer) { this.level = level; }
    fun setUUID(uuid: String) { this.uuid = uuid; }
}