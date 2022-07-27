export class Comment{

    constructor(
        private _id: number | null,
        private _userId: number| null,
        private _trailId: number| null,
        private _comment: string
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
    public get trailId(): number | null {
        return this._trailId;
    }

    public set trailId(value: number | null) {
        this._trailId = value;
    }
    public get comment(): string {
        return this._comment;
    }

    public set comment(value: string) {
        this._comment = value;
    }

    public static fromJson(json: any): Comment {
        return new Comment(
            json.id,
            json.userId,
            json.trailId,
            json.comment
        );
    }
}

