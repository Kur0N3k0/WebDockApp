package kr.nekop.models

class Token {
    private var tenant: String;
    private var expire_date: Double;
    private var token: String;

    constructor(
            tenant: String,
            expire_date: Double,
            token: String
    ) {
        this.tenant = tenant;
        this.expire_date = expire_date;
        this.token = token;
    }

    fun getTenant(): String { return tenant; }
    fun getExpireDate(): Double { return expire_date; }
    fun getToken(): String { return token; }

    fun setTenant(tenant: String) { this.tenant = tenant; }
    fun setExpireDate(expire_date: Double) { this.expire_date = expire_date; }
    fun setToken(token: String) { this.token = token; }
}