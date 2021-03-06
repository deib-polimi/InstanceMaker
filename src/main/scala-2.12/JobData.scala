/* Copyright 2017 Eugenio Gianniti
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import it.polimi.diceH2020.SPACE4Cloud.shared.inputDataMultiProvider.{ClassParameters, DirectedAcyclicGraph, JobProfile, PublicCloudParameters}

trait JobData {
  val jobClasses: Map[String, ClassParameters]
  val jobProfiles: Map[String, Map[String, Map[String, JobProfile]]]
  val publicCloud: Map[String, Map[String, Map[String, PublicCloudParameters]]]
  val dags: Map[String, DirectedAcyclicGraph]
}
