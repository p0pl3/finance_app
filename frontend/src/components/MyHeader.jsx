import React from 'react'
import {Navbar, NavbarBrand} from "reactstrap";
import {Link} from "react-router-dom";

function MyHeader() {
    return (
        <Navbar color="white" white>
            <NavbarBrand tag={Link} to="/home">Home</NavbarBrand>
            <NavbarBrand tag={Link} to="/category">Category</NavbarBrand>
        </Navbar>
    )
}

export default MyHeader
