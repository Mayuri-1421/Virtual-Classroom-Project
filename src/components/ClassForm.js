import React, { useState } from 'react';
import axios from 'axios';

const ClassForm = () => {
    const [className, setClassName] = useState('');
    const [description, setDescription] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        axios.post('/api/classes', { name: className, description })
            .then(response => alert('Class Created!'))
            .catch(error => console.error(error));
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>Class Name:</label>
                <input type="text" value={className} onChange={(e) => setClassName(e.target.value)} />
            </div>
            <div>
                <label>Description:</label>
                <textarea value={description} onChange={(e) => setDescription(e.target.value)} />
            </div>
            <button type="submit">Create Class</button>
        </form>
    );
};

export default ClassForm;
