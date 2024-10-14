import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ClassList from './components/ClassList';
import ClassForm from './components/ClassForm';

const App = () => {
    return (
        <Router>
            <Switch>
                <Route path="/" exact component={ClassList} />
                <Route path="/create-class" component={ClassForm} />
            </Switch>
        </Router>
    );
};

export default App;
