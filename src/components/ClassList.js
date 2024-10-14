import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ClassList = () => {
    const [classes, setClasses] = useState([]);

    useEffect(() => {
        axios.get('/api/classes')
            .then(response => setClasses(response.data))
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            <h1>Class List</h1>
            <ul>
                {classes.map((classItem) => (
                    <li key={classItem.id}>{classItem.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default ClassList;
