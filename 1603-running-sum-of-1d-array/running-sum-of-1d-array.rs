impl Solution {
pub fn running_sum(nums: Vec<i32>) -> Vec<i32> {
    let mut output = Vec::new();
    let mut currentSum = 0;

        for &i in nums.iter() {
            currentSum = currentSum + i;
            output.push(currentSum);
        }
    return output;    
    }
}