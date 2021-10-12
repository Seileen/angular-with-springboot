export class User {
    id: number = 0;
    firstName: string = "";
    lastName: string = "";
    email: string = "";

    User(id: number,  firstName: string,
        lastName: string,
        email: string,)
        {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

}
