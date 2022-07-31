import { Trail } from "./trail.model";

export class Comment{

    constructor(
        private _id: number | null,
        private _userId: number| null,
        private _trail: Trail | null,
        private _text: string
    ){}

    public get id(): number | null {
        return this._id;
    }
    public set id(value: number | null) {
        this._id = value;
    }

    public get userId(): number | null {
        return this._userId;
    }
    public set userId(value: number | null) {
        this._userId = value;
    }
    public get trail(): Trail | null {
        return this._trail;
    }

    public set trail(value: Trail | null) {
        this._trail = value;
    }
    public get text(): string {
        return this._text;
    }

    public set text(value: string) {
        this._text = value;
    }

    public static fromJson(json: any): Comment {
        return new Comment(
            json.id,
            json.userId,
            json.trail,
            json.text
        );
    }
}

