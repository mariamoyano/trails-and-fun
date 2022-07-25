export class User {

    constructor(
        private _id: number | null,
        private _username: string,
        private _password: string,
        private _roles: object[],
    ) {}

    public get roles(): object[] {
        return this._roles;
    }
    public set roles(value: object[]) {
        this._roles = value;
    }
    public get password(): string {
        return this._password;
    }
    public set password(value: string) {
        this._password = value;
    }
    public get username(): string {
        return this._username;
    }
    public set username(value: string) {
        this._username = value;
    }
    public get id(): number | null {
        return this._id;
    }
    public set id(value: number | null) {
        this._id = value;
    }

    public toJSON(): object {
        return {
            id: this._id,
            username: this._username,
            password: this._password,
            roles: this._roles,
        };
    }
}