import React from 'react'
import MySideMenu from "../components/MySideMenu";
import MyDropDownMenu from "../components/MyDropDownMenu";


function MainPage() {
    const accs = [
        {"id": 1, "name": "acc123456", "balance": 100.1},
        {"id": 2, "name": "acc2", "balance": 200.2},
        {"id": 3, "name": "acc3", "balance": 300.3}
    ]
    return (
        <div>
            <MySideMenu/>
            <MyDropDownMenu styles={{display: 'flex', justifyContent: 'center'}} items={accs}/>
        </div>
    )
}

export default MainPage