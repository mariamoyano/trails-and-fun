export class Events{
    constructor(
        private _id: number | null,
        private _userId: number| null,
        private _name: string,
        private _description: string,
        private _address: string,
        private _region: string,
        private _latitude: number,
        private _longitude: number,
        private _date: string,
        private _time: string,
        private _price: number,
        private _type: string
        
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
    public get date(): string {
        return this._date;
    }
    public set date(value: string) {
        this._date = value;
    }
    public get time(): string {
        return this._time;
    }
    public set time(value: string) {
        this._time = value;
    }
    public get price(): number {
        return this._price;
    }
    public set price(value: number) {
        this._price = value;
    }
    public get type(): string {
        return this._type;
    }
    public set type(value: string) {
        this._type = value;
    }
    
   

  
}


