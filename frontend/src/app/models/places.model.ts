
import { User } from "./user.model"
export class Places {
    constructor(
        private _id: number | null,
        private _userId: number| null,
        private _name: string,
        private _description: string,
        private _category: string,
        private _address: string,
        private _region: string,
        private _latitude: number,
        private _longitude: number,
        private _image: string
    ) {}

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
    public get category(): string {
        return this._category;
    }
    public set category(value: string) {
        this._category = value;
    }
    public get address(): string {
        return this._address;
    }
    public set address(value: string) {
        this._address = value;
    }
    public get region(): string {
        return this._region;
    }
    public set region(value: string) {
        this._region = value;
    }
    public get latitude(): number {
        return this._latitude;
    }
    public set latitude(value: number) {
        this._latitude = value;
    }
    public get longitude(): number {
        return this._longitude;
    }
    public set longitude(value: number) {
        this._longitude = value;
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
            user: this._userId,
            name: this._name,
            description: this._description,
            category: this._category,
            address: this._address,
            region: this._region,
            latitude: this._latitude,
            longitude: this._longitude,
            image: this._image
        };
    }














}