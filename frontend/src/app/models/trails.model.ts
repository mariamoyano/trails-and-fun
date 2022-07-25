import { User } from "./user.model";

export class Trails{
    constructor(
        private _id: number | null,
        private _userId: number,
        private _name: string,
        private _description: string,
        private _difficulty: string,
        private _length: number,
        private _address: string,
        private _location: string,
        
        private _image: string,
       
    ) {}

    public get id(): number | null {
        return this._id;
    }
    public set id(value: number | null) {
        this._id = value;
    }
    public get name(): string {
        return this._name;
    }
    public set name(value: string) {
        this._name = value;
    }
    public get description(): string {
        return this._description;
    }
    public set description(value: string) {
        this._description = value;
    }
    public get difficulty(): string {
        return this._difficulty;
    }
    public set difficulty(value: string) {
        this._difficulty = value;
    }
    public get length(): number {
        return this._length;
    }
    public set length(value: number) {
        this._length = value;
    }
    public get address(): string {
        return this._address;
    }
    public set address(value: string) {
        this._address = value;
    }
    public get location(): string {
        return this._location;
    }
    public set location(value: string) {
        this._location = value;
    }
    public get userId(): number {
        return this._userId;
    }
    public set userId(value: number) {
        this._userId = value;
    }
    public get image(): string {
        return this._image;
    }
    public set image(value: string) {
        this._image = value;
    }
    public toJSON(): object {
        return {
            id: this._id,
            name: this._name,
            description: this._description,
            difficulty: this._difficulty,
            length: this._length,
            address: this._address,
            location: this._location,
            userId: this._userId,
            images: this._image,
        };
    }
    


}