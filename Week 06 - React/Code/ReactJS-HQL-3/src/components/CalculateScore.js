import React, { useState } from 'react';

// Function to convert decimal to percentage format
const percentToDecimal = (decimal) => {
  return (decimal.toFixed(2) + '%');
};

// Function to calculate the score based on total and goal
const calcScore = (total, goal) => {
  return percentToDecimal(goal / total);
};

function CalculateScore() {
  const [name, setName] = useState('');
  const [school, setSchool] = useState('');
  const [total, setTotal] = useState('');
  const [goal, setGoal] = useState('');
  const [average, setAverage] = useState(null);

  // Calculate the average score when button is clicked
  const calculateAverage = () => {
    if (total && goal) {
      const avg = calcScore(parseInt(total), parseInt(goal));
      setAverage(avg);  // Update the state with the calculated average
    }
  };

  return (
    <div className="calculator-container">
      <h2>Student Score Calculator</h2>
      <input
        type="text"
        placeholder="Enter Name"
        value={name}
        onChange={(e) => setName(e.target.value)}  // Update the name state
      />
      <input
        type="text"
        placeholder="Enter School"
        value={school}
        onChange={(e) => setSchool(e.target.value)}  // Update the school state
      />
      <input
        type="number"
        placeholder="Total Score"
        value={total}
        onChange={(e) => setTotal(e.target.value)}  // Update the total score state
      />
      <input
        type="number"
        placeholder="Goal Score"
        value={goal}
        onChange={(e) => setGoal(e.target.value)}  // Update the goal score state
      />
      <button onClick={calculateAverage}>Calculate Average</button>  {/* Button to trigger calculation */}

      {average !== null && (
        <div>
          <h3>{name}, from {school}, your average score is: {average}</h3>  {/* Display the average */}
        </div>
      )}
    </div>
  );
}

export default CalculateScore;
