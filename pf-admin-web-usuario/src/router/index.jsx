import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Start from '../pages/Start/Start';
import NotFound from '../pages/NotFound/NotFound';

function Router() {
  return (
    <BrowserRouter>
      <Routes>
        <Route exact path="/" element = {<Start />} />
        <Route component={NotFound} />
      </Routes>
    </BrowserRouter>
  );
}

export default Router;