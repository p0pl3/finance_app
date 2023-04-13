import React, {useState} from 'react';
import {
    Dropdown,
    DropdownToggle,
    DropdownMenu,
    DropdownItem,
} from 'reactstrap';
import PropTypes from 'prop-types';

function MyDropDownMenu({styles, items}) {
    const [dropdownOpen, setDropdownOpen] = useState(false);

    const toggle = () => setDropdownOpen((prevState) => !prevState);

    return (
        <div style={styles}>
            <Dropdown isOpen={dropdownOpen} toggle={toggle}>
                <DropdownToggle caret>Счёт</DropdownToggle>
                <DropdownMenu style={{minWidth: "unset"}}>
                    {items.map(item => (
                        <DropdownItem>{item.name}</DropdownItem>
                    ))}
                </DropdownMenu>
            </Dropdown>
        </div>
    );
}

MyDropDownMenu.propTypes = {
    direction: PropTypes.string,
};

export default MyDropDownMenu;