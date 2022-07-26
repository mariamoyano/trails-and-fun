import { User } from "./user.model";

export class Trail{
    constructor(
        private _id: number | null,
        private _userId: number,
        private _name: string,
        private _description: string,
        private _difficulty: string,
        private _length: number,
        private _address: string,
        private _region: string,
        private _latitude: number,
        private _longitude: number,
        private _image: string,
    ) { }


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

    public toJSON(): object {
        return {
            id: this.id,
            userId: this.userId,
            name: this.name,
            description: this.description,
            difficulty: this.difficulty,
            length: this.length,
            address: this.address,
            region: this.region,
            latitude: this.latitude,
            longitude: this.longitude,
            image: this.image,
        };
    }

    


}