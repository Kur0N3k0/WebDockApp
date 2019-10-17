package kr.nekop.models

class FileList {
    private var is_base: Boolean;
    private var path: String;
    private var dir: ArrayList<String>;
    private var file: ArrayList<String>;

    constructor(
            is_base: Boolean,
            path: String,
            dir: ArrayList<String>,
            file: ArrayList<String>
    ) {
        this.is_base = is_base;
        this.path = path;
        this.dir = dir;
        this.file = file;
    }

    fun getIsBase(): Boolean { return this.is_base; }
    fun getPath(): String { return this.path; }
    fun getDir(): ArrayList<String> { return this.dir; }
    fun getFile(): ArrayList<String> { return this.file; }


}